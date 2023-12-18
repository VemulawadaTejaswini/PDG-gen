import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int i=0,j,k,count=0;
            int a[];
            int b[];
            a = new int[100000];
            b = new int[100000];
                Scanner n = new Scanner(System.in);
                while(true){
                     a[i] = n.nextInt();
                     b[i] = n.nextInt();
                     if(a[i]==0 && b[i]==0){
                         break;
                     }
                     count++;
                     i++;
                }
                i=0;
                while(count>i){
                     for(k=0;k<a[i];k++){
                         for(j=0;j<b[i];j++){
                             System.out.print("#");
                         }
                         System.out.printf("\n");
                     }
                     i++;
                     System.out.printf("\n");
                }
        }
    }
