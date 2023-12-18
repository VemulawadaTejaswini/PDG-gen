import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
	Scanner sc = new Scanner(System.in);
// 最初の文字の固まりを整数値と想定して読み込む while (true) {
	int N = sc.nextInt();
	int i;
	int A[];
	int flag = 1;
	int j=0;
	int save;
	A = new int[N];
for(i=0; i<N; i++){
	A[i] = sc.nextInt();
}

while(flag==1){
	flag=0;
	for(i=1; i<N; i++){
		if(A[i-1]>A[i]){
			save = A[i-1];
			A[i-1] = A[i];
			A[i] = save;
			j=j+1;
			flag=1;
		}
	}
}
for(i=0; i<N-1; i++)
System.out.print(A[i]+" ");
System.out.println(A[N-1]);
System.out.println(j);
}
}
