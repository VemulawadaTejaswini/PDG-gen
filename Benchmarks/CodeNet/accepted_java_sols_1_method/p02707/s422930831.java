import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n+1];
        for(int i=1;i<n;i++){
            ary[sc.nextInt()] ++;
        }
        for(int i=1;i<n+1;i++){
            System.out.println(ary[i]);
        }
        }
        }
