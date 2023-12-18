import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] v = new int[5005];
        for(int i = 0;i < 5005;i++){
            v[i] = 1;
        }
        int p = 3;
        while(true){
            if(p*p > 10010){
                break;
            }else{
                if(v[(p-1)/2] == 0){
                    p += 2;
                }else{
                    int t = p*p;
                    while(t < 10010){
                        v[(t-1)/2] = 0;
                        t += 2*p;
                    }
                    p += 2;
                }
            }
        }
        while(scan.hasNext()){
        	int n = scan.nextInt();
        	if(n == 0){
        		break;
        	}else if(n%2 == 0){
        		n--;
        	}
        	for(int i = n/2;i > 1;i--){
        		if(v[i] == 1 && v[i-1] == 1){
        			System.out.println(2*(i-1)+1 + " " + (2*i+1));
        			break;
        		}
        	}
        }
	}
}