import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        String[] hw = new String[h];
        for(int i=0; i<h; i++){
            hw[i] = sc.next();
        }

        sc.close();

        int[] line = new int[h];
        int[] column = new int[w];
        int total = 0;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(hw[i].charAt(j) == '#'){
                    total++;
                    line[i]++;
                    column[j]++;
                }
            }
        }
        // for(int i=0; i<h; i++){
        //     System.out.println(line[i]);
        // }
        // System.out.print("\n");
        // for(int i=0; i<w; i++){
        //     System.out.println(column[i]);
        // }
        // System.out.print("\n");

        int count = 0;
        for(int i=0; i<(1<<h); i++){
            List<Integer> lineList = new ArrayList<>();
            int temp = total;
            for(int j=0; j<h; j++){
                if((i & (1<<j)) > 0){
                    lineList.add(j);
                    temp -= line[j];
                }
            }
            for(int j=0; j<(1<<w); j++){
                int temp2 = temp;
                List<Integer> columnList = new ArrayList<>();
                for(int k=0; k<w; k++){
                    if((j & (1<<k)) > 0){
                        columnList.add(k);
                        temp2 -= column[k];
                    }
                }
                for(int k=0; k<lineList.size(); k++){
                    for(int l=0; l<columnList.size(); l++){
                        if(hw[lineList.get(k)].charAt(columnList.get(l)) == '#'){
                            temp2++;
                        }
                    }
                }
                if(temp2 == K){
                    //System.out.println("\n" + lineList.toString() + "\n" + columnList.toString() + "\n");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}