import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans=100;
        if(a==0){
        	if(b==100)
        		System.out.println(101);
        	else
        		System.out.println(b);
        }
        else{
        	if(a==2)
        		ans*=ans;
        	if(b==100)
        		System.out.println(ans*101);
        	else
        		System.out.println(ans*b);
        }



    }

}
