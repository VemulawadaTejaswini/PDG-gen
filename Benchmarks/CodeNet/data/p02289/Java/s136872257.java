import java.util.Scanner;

class Main
{
    static int N;
    static int[]A = new int[10000000];

    public static void maxHeapify(int i)
    {
	int l = 2 * i;
	int r = 2 * i + 1;
	int largest;

	if(l <= N && A[l] > A[i])
	    largest = l;
	else 
	    largest = i;

	if(r <= N && A[r] > A[largest])
	    largest = r;

	if(largest != i)
	    {
		int b = A[i];
		A[i] = A[largest];
		A[largest] = b;
		maxHeapify(largest);
	    }
    }

    public static int ex()
    {
	int maxv;
	if(N < 1) return -10000000;

	maxv = A[1];
	A[1] = A[N--];
	maxHeapify(1);
	return maxv;
    }

    public static void increase(int i, int key)
    {
	if(key < A[i]) return;
	A[i] = key;
	while(i > 1 && A[i / 2] < A[i])
	    {
		int b = A[i];
		A[i] = A[i / 2];
		A[i / 2] = b;
		i /= 2;
	    }
    }

    public static void insert(int key)
    {
	N++;
	A[N] = -1000000;
	increase(N,key);
    }

    public static void main(String[]args)
    {
	Scanner In = new Scanner(System.in);
	int key;
	String com;

	while(true)
	    {
		com = In.next();
		if(com.equals("end")) break;

		if(com.equals("insert"))
		    {
			key = In.nextInt();
			insert(key);
		    }
		else
		    {
			System.out.println(ex());
		    }
	    }
    }
}