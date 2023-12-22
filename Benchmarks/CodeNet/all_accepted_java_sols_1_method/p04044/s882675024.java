import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int L = input.nextInt();
        
        String a[] = new String[N];
        String s;
        for(int i = 0; i <N; i++){
            s = input.next();
            if(s.length()==L)
                a[i]=s;
        }
        Arrays.sort(a);
        for(int i = 0; i <a.length; i++)
             System.out.print(a[i]);
        
        System.out.println();
    }
}
