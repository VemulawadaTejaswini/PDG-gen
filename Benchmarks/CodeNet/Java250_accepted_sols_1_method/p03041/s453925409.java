import static java.lang.Math.ceil;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//          int a1 = sc.nextInt();
//          int a2 = sc.nextInt();
//          int a3 = sc.nextInt();
//        int c = sc.nextInt(); 
//        int r = sc.nextInt();
//        int x = sc.nextInt();
//        int a = sc.nextInt();
//        int s = sc.nextInt();
//        double n = sc.nextDouble(); 
//        int r = sc.nextInt(); 
//        String s = sc.next();
//        String t = sc.next();
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        char c = sc.next().charAt(0);
//        int p = sc.nextInt();
//        int q = sc.nextInt();
//        int r = sc.nextInt();
        sc.close();
//        String str = "";
        String[] array = s.split("");
        for(int i=0;i<n;i++){
            if(i == k-1){
                array[i] = array[i].toLowerCase();
//            }else{
//                str += array[i];
            }
            
        }
        String str = String.join("", array);
        System.out.println(str);
//        if(a<6){
//            System.out.println(0); 
//        }else if(a<13){
//            System.out.println(b/2); 
//        }else{
//            System.out.println(b); 
//        }
//        System.out.println(n/2); 
//        Integer array[] = {p+q,q+r,r+p};
//         Arrays.sort(array); // 昇順
//         System.out.println(array[0]); 
//        if(x < a){
//           System.out.println(0); 
//        }else{
//            System.out.println(10);
//        }
//        String[] array = s.split("");
//        boolean c = false;
////        Arrays.sort(array); // 昇順
//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i].equals(array[i+1])) {
//                c = true;
////                System.out.println("[i]: " + array[i]);
////                System.out.println("[i+1]: " + array[i+1]);
//            }
//        }
//        if (c) {
//            System.out.println("Bad");
//        } else {
//            System.out.println("Good");
//        }
//        System.out.println("[0]: "+array[0]);
//        System.out.println("[1]: "+array[1]);
//        System.out.println("[2]: "+array[2]);
//        System.out.println("[3]: "+array[3]);
//        if(array[0].equals(array[1]) && array[2].equals(array[3]) && !array[0].equals(array[3])){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//        a *= n;
//        if(a <= b){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
//        System.out.println();
//        double k = (a+b)/2.0;
//        if(k == ceil(k)){
//            System.out.println((int)k);
//        }else{
//            System.out.println("IMPOSSIBLE");
//        }

//        if(c-(a-b) >= 0 ){
//            System.out.println(c-(a-b));
//        }else{
//            System.out.println(0);
//        }
//        Integer array[] = {a+b,a-b,a*b};
//        Arrays.sort(array); // 昇順
//        Arrays.sort(array, Collections.reverseOrder()); // 降順
//        System.out.println(array[0]);
//        if(a>=3200){
//            System.out.println(s);
//        }else{
//            System.out.println("red");
//        }
//        String[] s_arr =  s.split("");
//        String[] t_arr =  t.split("");
//        int count=0;
//        for(int i = 0;i<s_arr.length;i++){
//            if(s_arr[i].equals(t_arr[i])){
//                count++;
//            }
//        }
//        System.out.println(count);
//        switch (s) {
//            case "Sunny":
//                System.out.println("Cloudy");
//                break;
//            case "Rainy":
//                System.out.println("Sunny");
//                break;
//            case "Cloudy":
//                System.out.println("Rainy");
//                break;
//        }
//        String array[] = {"SAT","FRI","THU","WED","TUE","MON","SUN"};
//        int count = 0;
//        for(int i = 1;i<array.length;i++){
//            if(s.equals(array[i])){
//                count += i;
//            }
//        }
//        if(n%2 == 0){
//            System.out.println(0.5000000000);
//        }else{
//            System.out.println(((n+1)/2)/n);
//        }
//        if(a<=b*2){
//            System.out.println(0);
//        }else{
//            System.out.println(a - 2*b);
//        }
//        if(a1 + a2 + a3 <= 21){
//            System.out.println("win");
//        }else{
//            System.out.println("bust");
//        }
//        Integer array[] = {a,b};
//        if(!Arrays.asList(array).contains(1)){
//            System.out.println(1);
//        }else if(!Arrays.asList(array).contains(2)){
//            System.out.println(2);
//        }else{
//            System.out.println(3);
//        }
//        if(k * 500 >= x){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        int i = 0;
//        for(;;){
//            if(alphabet[i] == c){
//                break;
//            }
//            i ++;
//        }
//        System.out.println(alphabet[i+1]);
//        if(n == m){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//        int count = 0;
//        for(;;){
//            if(h<=0){
//                break;
//            }
//            h -= a;
//            count ++;
//        }
////        System.out.println(h);
//        System.out.println(count);
//        String[] arr =  s.split(" ");
////        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(u);
//        if(arr[0].equals(u)){
//            a -= 1;
//            System.out.println(a+" "+b);
//        }else{
//            b -= 1;
//            System.out.println(a+" "+b);
//        }
//        List<Integer> list = Arrays.asList(a,b,c);
////        System.out.println(list);
//        List<Integer> list2 = new ArrayList<Integer>(new HashSet<>(list));
//        if(list2.size() == 2){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//        System.out.println(list2);
//        if(n >= 10){
//            System.out.println(r);
//        }else{
//            System.out.println(r + 100*(10-n));
//        }
//        if(n % 2 == 0){
//            n = (n/2);
//            System.out.println(n);
//        }else{
//            n = n/2 + 1;
//            System.out.println(n);
//        }
//        int sum = 0;
//        sum = n*(n-1)/2 + m*(m-1)/2;
//        System.out.println(sum);
//        String[] arr =  s.split("");
//         System.out.println("arr[2]: "+arr[2]);
//          System.out.println("arr[3]: "+arr[3]);
//           System.out.println("arr[4]: "+arr[4]);
//            System.out.println("arr[5]: "+arr[5]);
//        if(arr[2].equals(arr[3]) && arr[4].equals(arr[5])){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//        System.out.println(z + " " + x + " " + y);
//        if(n.contains("7")){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//        System.out.println(n);
//        if(s <= w){
//            System.out.println(Math.PI);
//        }else{
//            System.out.println("safe");
//        }
//        System.out.println(s);
//        if(s.contains("RRR")){
//            System.out.println(3);
//        }else if(s.contains("RR")){
//            System.out.println(2); 
//        }else if(s.contains("R")){
//            System.out.println(1);
//        }else{
//             System.out.println(0);
//        }
//        String s = sc.nextLine();
//        String t = sc.next();
//        String[] arr =  s.split("　");
//        sc.close();
//        System.out.println("input: "+ s);
//        System.out.println("k:" + k);
//        System.out.println("a:" + a);
//        System.out.println("b:" + b);
//        String ans = "NG";
//        for(int x = a; x<=b; x++){
//            if(x%k == 0){
//                ans = "OK";
//            }
//        }
//        System.out.println(ans);
//        \
//        System.out.println("arr[1]:" + arr[1]);
//
//        if(s.equals("ABC")){
//            System.out.println("ARC");
//        }else{
//            System.out.println("ABC");
//        }
//        String[] arr1 =  s.split("");
//        String[] arr2 =  t.split("");
////        List<String> list1 = Arrays.asList(s.split(""));
//        List list1 = new LinkedList(Arrays.asList(s.split("")));
////        List<String> list2 = Arrays.asList(t.split(""));
//        List list2 = new LinkedList(Arrays.asList(t.split("")));
////        int num = Integer.parseInt(arr[arr.length - 1]);
//        list2.remove(arr2.length - 1);
////        System.out.println(list1);
////        System.out.println(list2);
//         if(list1.toString().contentEquals(list2.toString())){
//             System.out.println("Yes");
//         }else{
//             System.out.println("No");
//         }
//        switch(num){
//            case 3:
//                System.out.println("bon");
//                break;
//            case 0:
//            case 1:
//            case 6:
//            case 8:
//                System.out.println("pon");
//                break;
//            default:
//                System.out.println("hon");
//                break;
//        }
//        String[] array = str.split(" ");
//        int sum = 0;
//        for(int i=0; i<array.length; i++) {
//            int num = Integer.parseInt(array[i]);
//            sum += num;
//        }
//        System.out.println(15-sum);
    }
}
