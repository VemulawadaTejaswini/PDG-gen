
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Set<Integer> s=new HashSet<>();
        boolean flag=false;
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            if(s.contains(x)){
                flag=true;
                break;
            }else
                s.add(x);

        }
        if(!flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
