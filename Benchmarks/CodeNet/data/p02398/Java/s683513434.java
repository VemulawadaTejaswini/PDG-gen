import java.util.*;

public class Main{
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int count=0;
        for(;;a++){
            if(c%a==0)
                count++;
            if(a==b)
                break;
        }
        System.out.println(count);
    }
}
