import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n=sc.nextInt();
String[] w=new String[n];
for (int i = 0; i < n; i++) {
    w[i]=sc.next();
}
HashSet<String> set=new HashSet<>();
set.add(w[0]);
for (int i = 1; i < n; i++) {
    set.add(w[i]);
    if(w[i].charAt(0)!=w[i-1].charAt(w[i-1].length()-1)){
        out.println("No");
       exit(0);
    }
}
  String ans;
if(set.size()==n){
    ans="Yes";
}else{
    ans="No";
}
  out.println(ans);
}}
