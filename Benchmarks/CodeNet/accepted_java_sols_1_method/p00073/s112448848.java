import java.util.*;
public class Main {
    public static void main(String[] ano) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(true){
        	int x =scan.nextInt();
        	int h =scan.nextInt();
        	if(x==0&&h==0)break;
        	System.out.println(Math.pow(x, 2)+Math.sqrt(Math.pow((double)x/2, 2)+Math.pow(h, 2))*x*2);
        }
}
}