import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int k=sc.nextInt()-1;
        String output="";
        char remove=s.charAt(k);
        for(int i=0;i<n;i++){
            if(remove==s.charAt(i)){
                output+=remove;
            }else{
                output+="*";
            }
        }
        System.out.println(output);
    }
}