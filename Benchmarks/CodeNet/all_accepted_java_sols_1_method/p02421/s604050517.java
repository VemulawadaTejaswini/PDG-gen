import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n, t, h;
    t=0;
    h=0;
    n = sc.nextInt();
    String a,b;
    for(int i=0;i<n;i++){
    a=sc.next();
    b=sc.next();
    if(a.compareTo(b)>0)t+=3;
    else if(a.compareTo(b)<0)h+=3;
    else {
        t++;
        h++;
    }
    }
    System.out.println(t+" "+h);
    }
    
}
