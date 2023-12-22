import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s = sc.next();
        String s1 = sc.next();

        int n = Integer.parseInt(s);
        int l = Integer.parseInt(s1);
        //char[] code = s.toCharArray();
        int ans =0;
        //System.out.println((s + s).contains(s2) ? "Yes" : "No");
        int[] apple = new int[n+1];
        int sum = 0;
        int min = 100000;
        int min2 = 100000;
        for(int i = 1; i < n+1; i++){
            apple[i]= l+i-1;
            sum += apple[i];
            //System.out.print(apple[i]+ " ");

            if(Math.abs(apple[i])<min){
                min2 = apple[i];            
                min = Math.min(Math.abs(apple[i]),min);
            }
        }
        //System.out.println(min2);
        ans = sum - min2;




        System.out.println(ans);

    }
}