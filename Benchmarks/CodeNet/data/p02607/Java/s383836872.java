
import java.util.Scanner;
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        ArrayList<Integer> ar = new ArrayList<>(); 
        sc.forEachRemaining(e -> ar.add(Integer.parseInt(e)));
        for (int i=0; i<ar.size();i++){
            if(i%2 !=0 && ar.get(i)%2!=0){
                ans +=1;
            }
        }
        System.out.println(ans);
    }
}
