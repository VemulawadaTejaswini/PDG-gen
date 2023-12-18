import java.util.*;
 
class Main{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
        int n, x, cnt;
		cnt = 0;

		while(true){
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
						//System.out.println("arr[i]:" + arr[i] + ",arr[j]:" + arr[j] + ",arr[k]:"+ arr[k]);
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