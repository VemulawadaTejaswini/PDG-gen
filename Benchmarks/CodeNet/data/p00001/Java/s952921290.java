class Main {
public static void main (String a[]){

Scanner scan = new Scanner (System.in); 

ArrayList<Integer> list = new ArrayList<Integer>();

while(scan.hasNextLine()){
    String str = scan.nextLine();
    list.add(Integer.parseInt(str));
}

}
}
