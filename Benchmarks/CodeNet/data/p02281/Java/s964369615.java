//import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	static int n;
	static int a[]=new int[100];
	static int b[]=new int[100];
	static int c[]=new int[100];
	static int root;
	static int index_of_root() {
	    h:for(int i=0; i<n; i++) {
	        for(int j=0; j<n; j++) {
	            if(a[i]==b[j]||a[i]==c[j]) {
	                continue h;
	            }
	        }
	        return i;
	    }
		return 0;
	}
	static void out1(int m) {
	    System.out.printf(" %d",a[m]);
	    if(b[m]!=-1) {
	        out1(b[m]);
	    }
	    if(c[m]!=-1) {
	        out1(c[m]);
	    }
	}
	static void out2(int m) {
	    if(b[m]!=-1) {
	        out2(b[m]);
	    }
	    System.out.printf(" %d",a[m]);
	    if(c[m]!=-1) {
	        out2(c[m]);
	    }
	}
	static void out3(int m) {
	    if(b[m]!=-1) {
	        out3(b[m]);
	    }
	    if(c[m]!=-1) {
	        out3(c[m]);
	    }
	    System.out.printf(" %d",a[m]);
	}
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	n=in.nextInt();
    	for(int i=0; i<n; i++) {
            a[i]=in.nextInt();
            b[i]=in.nextInt();
            c[i]=in.nextInt();
        }
        root=index_of_root();
        System.out.printf("Preorder\n");
        out1(root);
        System.out.printf("\n");
        System.out.printf("Inorder\n");
        out2(root);
        System.out.printf("\n");
        System.out.printf("Postorder\n");
        out3(root);
        System.out.printf("\n");
    	in.close();
    }
}
