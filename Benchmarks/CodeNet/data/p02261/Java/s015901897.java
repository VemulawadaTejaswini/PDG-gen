import java.util.Scanner;
public class Main{
    public static int value(String data){
        return (data.charAt(1) - '0');
    }
    public static void print(String data[]){
        for(int i = 0 ; i < data.length-1 ; i++)
            System.out.print(data[i] + " ");
        System.out.println(data[data.length-1]);
    }
    public static void Sort(String data[], int n){
        String a[] = new String[n];
	String b[] = new String[n];
	for(int i = 0 ; i < n ; i++){
		a[i] = data[i];
		b[i] = data[i];
	}
	for(int i = 0 ; i < n-1 ; i++){
		for(int j = n-1 ; j > i ; j--){
			if(value(a[j]) < value(a[j-1])){
				String tmp = a[j];
				a[j] = a[j-1];
				a[j-1] = tmp;
			}
		}
	}
	print(a);
	System.out.println("Stable");
	for(int i = 0 ; i < n ; i++){
		int minj = i;
		for(int j = i ; j < n ; j++){
			if(value(b[j]) < value(b[minj]))
				minj = j;
		}
		String tmp = b[i];
		b[i] = b[minj];
		b[minj] = tmp;
	}
	print(b);
	for(int i = 0 ; i < n ; i++)
	{
		if(!(a[i].equals(b[i]))){
			System.out.println("Not stable");
			break;
		}
		else if(i == n-1)
			System.out.println("Stable");
	}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String data[] = new String[n];
        for(int i = 0 ; i < n ; i++)
            data[i] = sc.next();
        Sort(data,n);
    }
}
