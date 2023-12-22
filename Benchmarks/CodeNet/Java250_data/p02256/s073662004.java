
import java.util.*;

class Animal
{
    String name;
    String genus;
    int region;

    public Animal(String name, String genus, int region)
    {
        this.name = name;
        this.genus = genus;
        this.region = region;
    }

    public int getRegion()
    {
        return this.region;
    }

    public String getGenus()
    {
        return this.genus;
    }

    public String getName()
    {
        return this.name;
    }
}

class Human extends Animal
{
    String sex;
    String bloodGroup;

    public Human(String sex, String bloodGroup)
    {
        super("HS", "homo", 1);
        this.sex = sex;
        this.bloodGroup = bloodGroup;
    }

    public String getSex()
    {
        return sex;
    }

    public String getBloodGroup()
    {
        return bloodGroup;
    }
}

public class Main
{

    public static Scanner in = new Scanner(System.in);

    public void print(int[] a)
    {
        for (int i = 0; i <a.length-1 ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(a[a.length-1]);
    }

    public int[] insert(int[] a)
    {

        for (int i = 0; i <a.length ; i++)
        {
            int key=a[i];
            int j=i-1;

            while (j>=0 && a[j]>key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            new Main().print(a);
        }
        return a;

    }

    public int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b, a%b);
        }
    }

    public void go()
    {
        int a = in.nextInt();
        int b = in.nextInt();

        int value = new Main().gcd(a, b);

        System.out.println(value);

    }

    public static void main(String[] args)
    {
        new Main().go();


    }
}