import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int l = -1;
        int r = 1;
        int left = 0;
        int right = 0;
        
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            array.add(i+1);
        }
        for(int i = 0; i < n; i++){
            array.set( array.indexOf(sc.nextInt()), 0);
        }
        if(array.get(x-1) == 0){
            while(true){
                left = x-1 + l;
                right = x-1 + r;
                if(left == -1){
                    left = 0;
                }
                if(right == 100){
                    right = 99;
                }
                if(array.get(left) != 0){
                    System.out.println(array.get(left));
                    break;
                }else if(array.get(right) != 0){
                    System.out.println(array.get(right));
                    break;
                }else {
                    l--;
                    r++;
                }
            }
        }else{
            System.out.println(x);
        }
        
    }
}
