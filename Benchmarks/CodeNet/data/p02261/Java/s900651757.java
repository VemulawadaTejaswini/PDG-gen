import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i, j, k;
		int n = sc.nextInt();
		String a[] = new String[n];
		String b[] = new String[n];
		for(i = 0; i < n; i++){
			String s = sc.next();
			a[i] = s;
			b[i] = s;
		}
		bubblesort(n, a);
		selectionsort(n, b);
		
		for(i = 0; i < n; i++){
			System.out.print(( i == 0 ? "" : " ") + a[i]);
		}
		System.out.println();
		System.out.println("stable");
		for(i = 0; i < n; i++){
			System.out.print(( i == 0 ? "" : " ") + b[i]);
		}
		System.out.println();
		int hantei = 0;
		for(i = 0; i < n; i++){
			if(a[i].equals(b[i])){
				hantei = 1;
			}
			else{
				hantei = 0;
				break;
			}
		}
		if(hantei == 1){
			System.out.println("Stable");
		}
		else{
			System.out.println("Not stable");
		}
	}
	
	public static void bubblesort(int n, String a[]){
        int flag = 1;
        int i = 0;
        String temp;
        while(flag == 1){
            flag = 0;
            for(int j = n - 1; j >= i + 1; j--){
                if(a[j].charAt(1) < a[j - 1].charAt(1)){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j - 1] = temp;
                    flag = 1;
                }
            }
            i++;
        }
	}
	
	public static void selectionsort(int n, String a[]){
        int count = 0;
        for (int i = 0; i <= n - 1; i++){
            int minj = i;
            for(int j = i; j <= n - 1; j++){
                if(a[j].charAt(1) > a[minj].charAt(1)){
                    minj = j;
                }
            }
            if(a[i] != a[minj]) count++;
            String temp = a[i];
            a[i] = a[minj];
            a[minj] = temp;
        }
	}

}

