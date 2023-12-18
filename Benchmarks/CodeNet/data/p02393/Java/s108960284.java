import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lst = new int[3];
        for(int i=0;i<3;i++){lst[i]=sc.nextInt();}
        for(int i=1;i<3;i++){
            int x=lst[i],g=i-1;
            while(g>=0 && x<lst[g]){
                lst[g+1]=lst[g];lst[g]=x;g--;
            }
        }
        System.out.printf("%d %d %d\n",lst[0],lst[1],lst[2]);
    }
}

