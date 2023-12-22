import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int tarou_point = 0;
		int hanako_point = 0;
		
		for (int i = 0; i < n; i++){
		    String []words = sc.nextLine().split(" ");
		    char tarou[] = words[0].toCharArray();
		    char hanako[] = words[1].toCharArray();
		    int flag = 2;
		    
		    int length = hanako.length;
		    
		    if (tarou.length < hanako.length){
		        length = tarou.length;
		    }
		    
		    for (int l = 0; l < length; l++){
		        if (tarou[l] < hanako[l]){
		            flag = 0;
		            break;
		        }else if(tarou[l] > hanako[l]){
		            flag = 1;
		            break;
		        }
		    }
		    
		    if (flag == 0){
		        hanako_point += 3;
		    }else if(flag == 1){
		        tarou_point += 3;
		    }else{
		        if (tarou.length > hanako.length){
		            tarou_point += 3;
		        }else if (tarou.length < hanako.length){
		            hanako_point += 3;
		        } else{
		            hanako_point += 1;
		            tarou_point  += 1;
		        }
		        
		    }
		}
		
		System.out.println(tarou_point + " " + hanako_point);
	}
}
