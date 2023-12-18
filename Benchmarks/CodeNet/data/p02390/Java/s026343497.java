using System;
 
namespace Watch
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
 
            int h = a / 3600;
            int x = a % 3600;
 
            int m = x / 60;
            int s = x % 60;
 
            Console.WriteLine(h + ":" + m + ":" + s);
        }
    }
}