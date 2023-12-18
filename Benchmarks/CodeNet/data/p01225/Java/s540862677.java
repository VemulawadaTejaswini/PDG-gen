import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x=0;x<n;x++){
            int countR=0, countG=0, countB=0, count=0;
            int[] num = new int[9];
            String[] cor = new String[9];
            for(int i=0;i<9;i++){
                num[i] = sc.nextInt();
            }
            for(int i=0;i<9;i++){
                cor[i] = sc.next();
                if(cor[i].equals("R")) countR++;
                if(cor[i].equals("G")) countG++;
                if(cor[i].equals("B")) countB++;
            }
            if((countR%3)!=0){
                System.out.println("0");
                continue;
            }
            if((countG%3)!=0){
                System.out.println("0");
                continue;
            }
            if((countB%3)!=0){
                System.out.println("0");
                continue;
            }
            Arrays.sort(num);
            for(int i=0;i<9;i+=3){
                if((num[i]==num[i+1] && num[i]==num[i+2]) || ((num[i]+1)==num[i+1] && (num[i]+2)==num[i+2])) count++;
            }
            if(count==3){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}
