import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int i=0,count=0,d;
            String a,c;
            int b[];
            b = new int[100000];
                Scanner n = new Scanner(System.in);
                while(true){
                     a = n.nextLine();
                     if(a=='0'){
                         break;
                     }
                     for(i=0;i<a.length;i++){
                         c = a.charAt(i);
                         d = Integer.parseInt(c);
                         sum = sum + d;
                     }
                     b[i] = sum; 
                     count++;
                     i++;
                }
                while(count>i){
                     System.out.printf("%d",b[i]);
                     i++;
                     System.out.printf("\n");
                }
        }
    }
