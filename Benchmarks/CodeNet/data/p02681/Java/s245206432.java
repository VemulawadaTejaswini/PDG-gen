def main():
    first_try = input()
    second_try = input()

    if first_try == second_try[:-1]:
        print('Yes')
    else:
        print('No')


if __name__ == '__main__':
    main()
