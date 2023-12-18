public class Main{
	public static void main(String[] args){
		int[] a = new int[10];
		for(int i = 0; i < 10; i++){
				a[i] = Integer.parseInt(args[i]);
			}

		for(int i = 0; i < 9; i++){
			for(int j = 1; j < 10; j++){
				if(a[i] < a[j]){
					int p = a[i];
					a[i] = a[j];
					a[j] = p;
				}
			}
		}
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}