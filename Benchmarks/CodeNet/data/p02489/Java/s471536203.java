import java.util.*;
class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
StringBuilder ans = new StringBuilder();
for(int i = 1; in.hasNext(); i++) {
int x = in.nextInt();
if(x==0) break;
ans.append(String.format("Case %d: %d\n",i,x));
}
System.out.print(ans.toString());
}
}