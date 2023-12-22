import java.util.Arrays;
import java.util.Scanner;

//import java.io.*;
 
//class Main{
//    public static void main(String[] args) throws Exception{
//        int x, ans;
//     
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        x = Integer.parseInt(br.readLine());
//         
//        ans = x*x*x;
//        System.out.println(ans);
//    }
//}

//class Main {
//    public static void main(String[] arg)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        String[] div = str.split(" ");
//        int s =  Integer.parseInt(div[0]);
//        int l =  Integer.parseInt(div[1]);
//        System.out.println(s*l + " "+ 2*(s+l));
//    }   
//}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//   
//public class Main{
//    public static void main(String args[])throws java.lang.Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();
//        //変数に配列を代入
//        int s =Integer.parseInt(line);
//        int h = s / 3600;
//        int m = (s % 3600) / 60;
//        s = s % 60;
//        System.out.println(h+":"+m+":"+s);
//         
//    }
//}

//import java.io.*;
//
//public class Main
//{
//	public static void main(String[] args) throws Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		String[] div = str.split(" ");
//		int a = Integer.parseInt(div[0]);
//		int b = Integer.parseInt(div[1]);
//		if (a > b)
//		{
//			System.out.println("a > b");
//		} else if (a == b) {
//			System.out.println("a == b");
//		} else {
//			System.out.println("a < b");
//		}
//	}
//}

//public class Main
//{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		String[] div = str.split(" ");
//		int a = Integer.parseInt(div[0]);
//		int b = Integer.parseInt(div[1]);
//		int c = Integer.parseInt(div[2]);
//		if (a < b && b < c)
//		{
//			System.out.println("Yes");
//		}else{
//			System.out.println("No");
//		}
//	}
//}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		int[] sort = {first, second, third};
		
		Arrays.sort(sort);
		
		System.out.println(sort[0] + " " + sort[1] + " " + sort[2]);
	}
}