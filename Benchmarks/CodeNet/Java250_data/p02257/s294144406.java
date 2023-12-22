import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int k = 2;
		int flag = 1; //0???????´???°??§????????????1???????´???°
		int cnt = 0; //?´???°?????°???????????????
		for(int i=0; i<arr.length; i++){
			while(k <= Math.sqrt(arr[i])+1){
			//while(arr[i] != k){
			//wh1ile(list.hasnext()){
				//System.out.println("arr[i]:" + arr[i] + ",k:" + k + ",??????:" + arr[i] % k);
				if(arr[i] % k == 0 && arr[i] != 2){
					flag = 0;
					break;
				}
				k++;
			}
			if(flag == 1){cnt++;}
			flag = 1;
			k = 2;
		}
		System.out.println(cnt);
	}
}