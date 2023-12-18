import java.util.*;
public class AOJ_1180_2{
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] A = new String[21];
            String a = sc.next();
            int L = sc.nextInt();
            if(a.equals("0") && L == 0){
                break;
            }
            while(a.length() < L){
                a = "0" + a;
            }
            A[0] = a;
            for(int i = 1; i <= 20; i++){
                A[i] = func(A[i-1],L);
            }
            //System.out.println(Arrays.toString(A));
            String ans = ""; 
            for(int i = 0; i <= 20; i++){
                for(int ii = i+1; ii <= 20; ii++){
                    if(A[i].equals(A[ii])){
                        ans = i + " " + Integer.parseInt(A[i]) + " " + (ii - i);
                        break;
                    }
                }
                if(ans != ""){
                    break;
                }
            }
            System.out.println(ans);
        }    
    }
    String func(String a, int L){
        int[] array = new int[a.length()];
        for(int i = 0; i < a.length(); i++){
            array[i] = Integer.parseInt("" + a.charAt(i));
        }
        Arrays.sort(array);
        String big = "";
        String small = "";
        for(int num: array){
            big = num + big;
            small = small + num;
        }
        String next_a = "" + (Integer.parseInt(big) - Integer.parseInt(small));
        while(next_a.length() < L){
            next_a = "0" + next_a;
        }
        return next_a;
    }
    public static void main(String[] args){
        new AOJ_1180_2().run();
    }
}