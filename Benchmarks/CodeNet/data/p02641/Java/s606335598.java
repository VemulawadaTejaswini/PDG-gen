import java.util.*;


class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),n=sc.nextInt();
        if(n==0){
            System.out.println(x);
        }else {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0;i<n;i++){
                list.add(sc.nextInt());
            }
            int ans =1001001001;
            for(int i = 0;i<=100;i++){
                if(!list.contains(i)&&Math.abs(x-i)<Math.abs(x-ans)){
                    ans = i;
                }
            }
            System.out.println(ans);
        }
    }
}
