import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        new Main().solve();
    }

    void solve(){

        String stations;
        Scanner sc = new Scanner(System.in);
        stations = sc.next();
        sc.close();

        char[] arr = new char[stations.length()];
        boolean exist = false;

        for(int i=0; i < stations.length(); i++){
            arr[i] = stations.charAt(i);
            if(arr[i] != arr[0]){
                exist = true;
                break;
            }
        }
        
        if(exist){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}