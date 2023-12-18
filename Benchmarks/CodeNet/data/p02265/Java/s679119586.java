import java.io.*;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by ??\??? on 2016/12/6.
 */
public class Main {
    static int si(String s){
        return Integer.parseInt(s);
    }
    static int run(String[] args)throws Exception{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T = si(scan.readLine());
        int[] l = new int[T];
        int h = 0;
        int p = 0;
        int len = 0;
        for(int t = 0;t<T;t++){
            String[] lines = scan.readLine().split(" ");
            if(lines.length==2) {
                int v = si(lines[1]);
                if(lines[0].equals("insert")){
                    l[p] = v;
                    p++;
                    len++;
                    if(p==T){
                        p=0;
                    }
                }
                else{
                    for(int j = p-1;;j--){
                        if(j<0){
                            j=T-1;
                        }
                        if(l[j]==v){
                            int point = j;
                            int next = j+1;
                            if(next==T){
                                next=0;
                            }
                            while(next!=p){
                                l[point] = l[next];
                                point++;
                                next++;
                                if(point==T){
                                    point=0;
                                }
                                if(next==T){
                                    next=0;
                                }
                            }
                            p = point;
                            len--;
                            break;
                        }
                    }
                }
            }
            else {
                if(lines[0].equals("deleteLast")){
                    h++;
                    if(h==T){
                        h = 0;
                    }
                    len--;
                }
                else {
                    p--;
                    if(p<0){
                        p=T-1;
                    }
                    len--;
                }
            }
        }
                            /*print*/
        int pl = 0;
        for(int i=p-1;;i--){
            if(i<0){
                i=T-1;
            }
            if(pl==0) {
                if (pl != len) {
                    System.out.print(l[i]);
                    pl++;
                } else {
                    System.out.println();
                    break;
                }
            }
            else{
                if (pl != len) {
                    System.out.print(" "+l[i]);
                    pl++;
                } else {
                    System.out.println();
                    break;
                }
            }
        }
        /*print end*/



        return 1;
    }
    public static void main(String[] args)throws Exception{
        run(args);
    }
}