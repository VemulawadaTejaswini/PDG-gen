import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Hanahuda {
    public static void main(String[] args) throws IOException{
        List<Integer> answer = new ArrayList<Integer>();

        while(true){
            Scanner sc = new Scanner(System.in);

            String nr = new String();
            int n, r;
            if(sc.hasNextLine()){
                nr = sc.nextLine();
                n = Integer.parseInt(nr.split(" ")[0]);
                r = Integer.parseInt(nr.split(" ")[1]);
            }else{
                break;
            }
            
            if(n == 0 && r == 0){
                break;
            }

            List<Integer> card = new ArrayList<Integer>();
            for(int i = n-1; i >= 0; i--){
                card.add(i + 1);
            }

            for(int i = 0; i < r; i++){
                String pc = sc.nextLine();
                System.out.println(pc);
                int p = Integer.parseInt(pc.split(" ")[0]);
                int c = Integer.parseInt(pc.split(" ")[1]);

                int[] tmp = new int[c];
                for(int j = 0; j < c; j++){
                    tmp[j] = card.get((p-1));
                    card.remove((p-1));
                }
                for(int j = tmp.length-1; j >= 0; j--){
                    card.add(0, tmp[j]);
                }
            }
            answer.add(card.get(0));
        }
        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}