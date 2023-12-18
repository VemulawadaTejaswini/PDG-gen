import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        String str = String.valueOf(n);
        String[] str2 = str.split("");
        int count=0;
        int []number = new int[3];
        

        for(int i=0;i<3;i++){
            number[i]=Integer.parseInt(str2[i]);
        }
        for(int i=0;i<3;i++){
            if(number[i]==7)
            count+=1;
        }
        if(count!=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}