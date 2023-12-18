class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = Integer.Max_Value;
        int max = Integer.Min_Value;
        long sum = 0;
        
        List<Integer> array = new ArrayList<Integer>();
        while (scan.hasNext()) {
             int i = scan.nextInt();
             array.add(i);
        }
        
        for(int j=0; j<array.size(); j++) {
            if(min > array.get(j)) min = array.get(j);
            if(max < array.get(j)) max = array.get(j);
            sum += array.get(j);
       }
       
       System.out.println(min +" "+ max +" "+ sum);
       scan.close();
    }
}