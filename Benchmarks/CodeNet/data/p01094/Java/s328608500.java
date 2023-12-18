import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(true){
           int n = Integer.parseInt(sc.nextLine());
           if(n == 0) break;
           int[] kouho = new int[26];
           for(int i=0;i<26;i++) {
                 kouho[i] = 0;
            }
           int[] current = new int[26];
           String[] vote = new String[n];
           boolean flag = false;
           
           vote = sc.nextLine().split(" ");
           loop: for(int i=0;i<n;i++){
               char c = vote[i].charAt(0);
               kouho[c-'A']++;
               for(int j=0;j<n;j++){
                   current[j] = kouho[j];
               }
               Arrays.sort(current);
               if(current[24] + (n-(i+1)) < current[25]){
                   int k = 0;
                   while(kouho[k] != current[25]){
                       k++;
                   }
                   System.out.printf("%c %d\n", k+'A', i+1);
                   flag = true;
                   break loop;
               }
           }
           if(!flag) System.out.println("TIE");
       }
    }
}

