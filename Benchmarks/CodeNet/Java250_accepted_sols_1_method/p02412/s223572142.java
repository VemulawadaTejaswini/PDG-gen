import java.util.*;
 
class Main{
    public static void main(String[] args){
		int n, x, cnt;
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
        
		while(true){
			cnt = 0;
			n = scan.nextInt();
			x = scan.nextInt();
			if(n==0 && x==0){
				break;
			}

			int[] arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = (i+1);
			}

			for(int i=0; i<n; i++){
				for(int j=i+1; j<n; j++){
					for(int k=j+1; k<n; k++){
						if((arr[i] + arr[j] + arr[k]) == x){
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
    }
}