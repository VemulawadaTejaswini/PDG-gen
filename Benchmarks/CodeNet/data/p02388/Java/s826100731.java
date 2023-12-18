
public class Main {
//    public static void main(String[] args) {
//        String hw= "Hello World";
//        System.out.println(hw);
//    }
    
    public static void main(String[] args) {

        if (args.length != 1){
            System.out.println("?????°???1????????????????????????");
            System.exit(1);
          }

        String seedStr= args[0];
        Double seed = Double.valueOf(seedStr);
        System.out.println(Math.pow(seed.doubleValue(), 3.0));
    }
}