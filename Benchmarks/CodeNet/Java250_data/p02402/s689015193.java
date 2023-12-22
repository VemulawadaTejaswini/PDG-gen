import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args){
        long sum=0;
        List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
for(int i=0;i<a;i++){
    int b=sc.nextInt();
    list.add(b);
    sum+=b;
}
System.out.println(Collections.min(list)+" "+Collections.max(list)+" "+sum);
    }
}
