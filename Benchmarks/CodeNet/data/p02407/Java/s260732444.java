import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            array.add(num);
        }
        for(int j=array.size()-1;j>=0;j--){
            if(j==0){
                System.out.println(array.get(j));
            }else{
                System.out.print(array.get(j) + " ");
            }
        }
    }
}

