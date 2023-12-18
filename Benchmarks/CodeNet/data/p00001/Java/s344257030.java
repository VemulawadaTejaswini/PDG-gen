import java.util.*;


class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();

        for ( int i = 0; i < 10; i++ ) {
            int height = sc.nextInt();
            list.add(height);
        }

        Collections.sort(list);
        Integer h1 = (Integer)list.get(9);
        Integer h2 = (Integer)list.get(8);
        Integer h3 = (Integer)list.get(7);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }

}