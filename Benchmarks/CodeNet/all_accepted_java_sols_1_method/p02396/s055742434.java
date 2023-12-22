import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while(true){
            int a = sc.nextInt();
            if(a==0){
                break;
            }
            list.add(a);
        }
        for(int i=1;i<=list.size();i++){
            System.out.println("Case "+i+": "+list.get(i-1));
        }
    }
}

