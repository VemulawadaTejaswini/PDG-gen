import java.util.*;


public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int k = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();        
        int s = sc.nextInt();
        int w = sc.nextInt();
        sc.close();
        if(s <= w){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }
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