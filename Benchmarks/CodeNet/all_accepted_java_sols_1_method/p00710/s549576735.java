
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int p, c;
        while(true){
            int n = scan.nextInt();
            int r = scan.nextInt();
            if(n == 0 && r == 0)break;
            
            int list[] = new int[n];
            int nlist[] = new int[n];
            for(int i = 0;i < n;i++)list[i] = n-i;
            
            for(int i = 0;i < r;i++){
                p = scan.nextInt();
                c = scan.nextInt();
                int j, count = 0;
                for(j = 0;j < c;j++) nlist[j] = list[p-1+j];
                count = j;
                for(j = 0;j < n;j++){
                    if(p-1 <= j && j < p-1+c)continue;
                    nlist[count] = list[j];
                    count++;
                }
                for(j = 0;j < n;j++) list[j] = nlist[j];
            }
            System.out.println(nlist[0]);
            

        
        }
        
        scan.close();
    }

    

}
