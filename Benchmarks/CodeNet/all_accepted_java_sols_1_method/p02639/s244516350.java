import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int res=0;
        for(int i=1; i<6; i++){
            if(sc.nextInt()==0){
                res = i;
                break;
            }
        }
        
        System.out.println(res);
        }
    }