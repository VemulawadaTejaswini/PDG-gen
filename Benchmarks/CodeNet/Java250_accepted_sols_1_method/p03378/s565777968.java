import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                int n = Integer.parseInt(line.split(" ")[0]);
                int m = Integer.parseInt(line.split(" ")[1]);
                int x = Integer.parseInt(line.split(" ")[2]);
                String[] a_strs = sc.nextLine().split(" ");
                int l = a_strs.length;
                int counter = 0;
                for(int i=0; i<l; i++){
                    if(Integer.parseInt(a_strs[i]) < x){
                        counter++;
                    }else{
                        break;
                    }
                }
                System.out.println((counter < l-counter) ? counter : l - counter);
            }
        }
    }
}