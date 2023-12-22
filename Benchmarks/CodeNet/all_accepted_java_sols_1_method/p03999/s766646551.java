import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        long output=0;
        long sub;
        for(int i=0;i<str.length();i++){
            sub=Integer.parseInt(str.substring(i,i+1));
            for(int j=0;j<str.length()-i;j++){
                output+=sub*Math.pow(10, j)*Math.pow(2, (str.length()-i-j-2<0?0:str.length()-i-j-2))*Math.pow(2, i);
            }
        }
        System.out.println(output);

    }
    
 
}