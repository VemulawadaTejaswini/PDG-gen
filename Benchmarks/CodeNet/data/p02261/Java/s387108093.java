import java.util.Scanner;

public class Main {

	  static String a[];
	    static String b[];
	    
	    static void BubbleSort(String a[],int n){
	        for(int i=0;i<n;i++){
	            for(int j=n-1;j>i;j--){
	                if(a[j].charAt(1)-'0'<a[j-1].charAt(1)-'0'){
	                    String temp = a[j];
	                    a[j] = a[j-1];
	                    a[j-1] = temp;
	                }
	            }
	        }
	    }
	    
	    static boolean flag = true;
	    
	    static void SelectionSort(String b[],int n){
	        for(int i=0;i<n;i++){
	            int min = i;
	            for(int j=i;j<n;j++){
	                if(b[j].charAt(1)-'0'<b[min].charAt(1)-'0'){
	                    min = j;
	                }
	            }
	            if(i != min){
	                String temp = b[i];
	                b[i] = b[min];
	                b[min] = temp;
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	         a = new String[n];
	         b = new String[n];
	        for(int i=0;i<n;i++){
	            a[i] = sc.next();
	            b[i] = a[i];
	        }
	        
	        BubbleSort(a,n);
	    
	        System.out.print(a[0]);
	        for(int i=1;i<n;i++){
	            System.out.printf(" %s",a[i]);
	        }
	        System.out.println();
	        System.out.println("Stable");
	        
	        SelectionSort(b,n);
	        
	        System.out.print(b[0]);
	        for(int i=1;i<n;i++){
	            System.out.printf(" %s",b[i]);
	        }
	        
	        for(int i=0;i<n;i++) {
	        	if(! a[i].equals(b[i])) {
	        		flag = false;
	        	}
	        }
	        
	        System.out.println();
	        if(flag){
	             System.out.println("Stable");
	        }else{
	            System.out.println("Not stable");
	        }
	    }	  

	}



