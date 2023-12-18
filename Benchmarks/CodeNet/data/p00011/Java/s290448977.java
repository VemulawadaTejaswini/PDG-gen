import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        sc.nextLine();
        int w = sc.nextInt();
        sc.nextLine();
        int[] f = new int[w];
        int[] l = new int[w];
        for(int i = 0;i < w;i++){
            String[] s = sc.nextLine().split(",");
            f[i] = Integer.parseInt(s[0]);
            l[i] = Integer.parseInt(s[1]);
        }
        int[] result = new int[h];
        for(int i = 1;i <= h;i++) result[amida(f,l,i) - 1] = i;
        for(int i = 0,size = result.length;i < size;i++) System.out.println(result[i]);
    }

    static int amida(int[] f,int[] l,int index){
        for(int i = 0,size = f.length;i < size;i++){
            if(f[i] == index) index = l[i];
            else if(l[i] == index) index = f[i];
        }
        return index;
    }

}