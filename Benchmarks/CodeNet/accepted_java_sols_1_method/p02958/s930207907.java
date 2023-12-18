import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int p[] = new int[N];
	for (int i = 0; i < N; i++)
	    p[i] = sc.nextInt();

	int count = 0;
	for (int i = 0; i < N - 1; i++) {
	    int key = i;
	    for (int j = i + 1; j < N; j++) {
		if (p[key] > p[j])
		    key = j;
	    }
	    
	    if (key != i) {
		int tmp = p[i];
		p[i] = p[key];
		p[key] = tmp;
		count++;
	    }
	}

	if (count < 2)
	    System.out.println("YES");
	else
	    System.out.println("NO");
    }
}