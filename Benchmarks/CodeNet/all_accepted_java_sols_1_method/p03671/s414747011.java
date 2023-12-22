import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int[] l=new int[3];
    for (int i = 0; i < 3; i++) {
        l[i]=Integer.parseInt(sc.next());
    }
Arrays.sort(l);
int ans=l[0]+l[1];

out.println(ans);
}
}