import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                long[] a = new long[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = Long.parseLong(sc.next());
                }
                sc.close();
                Arrays.sort(a);
                int lef = 0;
                int rig = n;
                while(rig - lef > 1){
                        int che = (lef + rig) / 2;
                        boolean nowh = true;
                        long hp = 0;
                        for(int i = 0 ; i <= che ; i++){
                                hp += a[i];
                        }
                        for(int i = che + 1 ; i < n && nowh ; i++){
                                if(hp * 2 < a[i]) nowh = false;
                                else hp += a[i];
                        }
                        if(nowh) rig = che;
                        else lef = che;
                }
                int yono = n - rig - 1;
                for(int che = rig ; che >= rig - 1 ; che--){
                        boolean nowh = true;
                        long hp = 0;
                        for(int i = 0 ; i <= che ; i++){
                                hp += a[i];
                        }
                        for(int i = che + 1 ; i < n && nowh ; i++){
                                if(hp * 2 < a[i]) nowh = false;
                                else hp += a[i];
                        }
                        if(nowh) yono++;
                }
                ou.print(yono + "\n");
                ou.flush();
        }
}